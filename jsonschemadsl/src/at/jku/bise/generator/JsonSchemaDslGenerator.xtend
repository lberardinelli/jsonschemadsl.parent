/*
 * generated by Xtext 2.23.0
 */
package at.jku.bise.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.URI
import jsonschemadsl2ecore.trafo.opt.utils.JsonSchemaToEcoreUtils
import org.eclipse.core.runtime.Path
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.NullProgressMonitor

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JsonSchemaDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var URI resourceURI = fsa.getURI('/').trimSegments(1).appendSegment('model')
					.appendSegment(resource.URI.trimFileExtension.lastSegment + '.ecore');
		
		var URI resourceOptURI = fsa.getURI('/').trimSegments(1).appendSegment('model')
					.appendSegment(resource.URI.trimFileExtension.lastSegment + '-opt.ecore');
					
		var URI grammarResourceURI = fsa.getURI('/').trimSegments(1).appendSegment('model')
					.appendSegment(resource.URI.trimFileExtension.lastSegment + '.jsongrammar');
					
		var URI traceResourceURI = fsa.getURI('/').trimSegments(1).appendSegment('model')
					.appendSegment(resource.URI.trimFileExtension.lastSegment + '.xmi');
		removeFilesIfExist(resourceURI);
		removeFilesIfExist(resourceOptURI);
		removeFilesIfExist(grammarResourceURI);
		removeFilesIfExist(traceResourceURI);
		// Not optimized Ecore
		new SchemaToEcoreGenerator(resource.URI.toString, resourceURI.toString).generateJsonSchema	
		
		//Optimize Trafo Ecore
		JsonSchemaToEcoreUtils.performTrafoEMFTVMJsonSchemaToEcore(resource.URI.toString, 
			resourceOptURI.toString, grammarResourceURI.toString, traceResourceURI.toString);	
	}
	
	def removeFilesIfExist(URI uri) {
		val IFile file = ResourcesPlugin.workspace.root.getFile(new Path(uri.toPlatformString(true)));
		file.delete(true, new NullProgressMonitor);
	}
	
}
