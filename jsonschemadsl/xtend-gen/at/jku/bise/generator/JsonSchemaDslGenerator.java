/**
 * generated by Xtext 2.23.0
 */
package at.jku.bise.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class JsonSchemaDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    URI _appendSegment = fsa.getURI("/").trimSegments(1).appendSegment("model");
    String _lastSegment = resource.getURI().trimFileExtension().lastSegment();
    String _plus = (_lastSegment + ".ecore");
    URI resourceURI = _appendSegment.appendSegment(_plus);
    InputOutput.<String>println(resourceURI.toString());
  }
}
