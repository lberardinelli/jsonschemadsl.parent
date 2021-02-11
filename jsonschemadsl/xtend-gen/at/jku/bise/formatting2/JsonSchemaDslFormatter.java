/**
 * generated by Xtext 2.23.0
 */
package at.jku.bise.formatting2;

import at.jku.bise.services.JsonSchemaDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonSchema;
import jsonMetaschemaMM.jsonMetaschemaMM.KeywordDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema;
import jsonMetaschemaMM.jsonMetaschemaMM.Schema;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class JsonSchemaDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private JsonSchemaDslGrammarAccess _jsonSchemaDslGrammarAccess;
  
  protected void _format(final JsonSchema jsonSchema, @Extension final IFormattableDocument document) {
    document.<Schema>format(jsonSchema.getSchema());
  }
  
  protected void _format(final ObjectSchema objectSchema, @Extension final IFormattableDocument document) {
    EList<KeywordDefinition> _keywordDefinition = objectSchema.getKeywordDefinition();
    for (final KeywordDefinition keywordDefinition : _keywordDefinition) {
      document.<KeywordDefinition>format(keywordDefinition);
    }
  }
  
  public void format(final Object objectSchema, final IFormattableDocument document) {
    if (objectSchema instanceof XtextResource) {
      _format((XtextResource)objectSchema, document);
      return;
    } else if (objectSchema instanceof ObjectSchema) {
      _format((ObjectSchema)objectSchema, document);
      return;
    } else if (objectSchema instanceof JsonSchema) {
      _format((JsonSchema)objectSchema, document);
      return;
    } else if (objectSchema instanceof EObject) {
      _format((EObject)objectSchema, document);
      return;
    } else if (objectSchema == null) {
      _format((Void)null, document);
      return;
    } else if (objectSchema != null) {
      _format(objectSchema, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(objectSchema, document).toString());
    }
  }
}