/*
 * generated by Xtext 2.23.0
 */
package at.jku.bise.ide.contentassist.antlr;

import at.jku.bise.ide.contentassist.antlr.internal.InternalJsonSchemaDslParser;
import at.jku.bise.services.JsonSchemaDslGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class JsonSchemaDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JsonSchemaDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JsonSchemaDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSchemaAccess().getAlternatives(), "rule__Schema__Alternatives");
			builder.put(grammarAccess.getKeywordDefinitionAccess().getAlternatives(), "rule__KeywordDefinition__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getSimpleTypesAccess().getAlternatives(), "rule__SimpleTypes__Alternatives");
			builder.put(grammarAccess.getJsonSchemaAccess().getGroup(), "rule__JsonSchema__Group__0");
			builder.put(grammarAccess.getObjectSchemaAccess().getGroup(), "rule__ObjectSchema__Group__0");
			builder.put(grammarAccess.getObjectSchemaAccess().getGroup_2(), "rule__ObjectSchema__Group_2__0");
			builder.put(grammarAccess.getObjectSchemaAccess().getGroup_2_1(), "rule__ObjectSchema__Group_2_1__0");
			builder.put(grammarAccess.getMaximumSchemaDefinitionAccess().getGroup(), "rule__MaximumSchemaDefinition__Group__0");
			builder.put(grammarAccess.getWriteOnlySchemaDefinitionAccess().getGroup(), "rule__WriteOnlySchemaDefinition__Group__0");
			builder.put(grammarAccess.getCommentSchemaDefinitionAccess().getGroup(), "rule__CommentSchemaDefinition__Group__0");
			builder.put(grammarAccess.getEnumSchemaDefinitionAccess().getGroup(), "rule__EnumSchemaDefinition__Group__0");
			builder.put(grammarAccess.getEnumSchemaDefinitionAccess().getGroup_2(), "rule__EnumSchemaDefinition__Group_2__0");
			builder.put(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getGroup(), "rule__UniqueItemsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getAnyOfSchemaDefinitionAccess().getGroup(), "rule__AnyOfSchemaDefinition__Group__0");
			builder.put(grammarAccess.getTitleSchemaDefinitionAccess().getGroup(), "rule__TitleSchemaDefinition__Group__0");
			builder.put(grammarAccess.getItemsSchemaDefinitionAccess().getGroup(), "rule__ItemsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getDefaultSchemaDefinitionAccess().getGroup(), "rule__DefaultSchemaDefinition__Group__0");
			builder.put(grammarAccess.getThenSchemaDefinitionAccess().getGroup(), "rule__ThenSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMinLengthSchemaDefinitionAccess().getGroup(), "rule__MinLengthSchemaDefinition__Group__0");
			builder.put(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup(), "rule__DefinitionsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4(), "rule__DefinitionsSchemaDefinition__Group_4__0");
			builder.put(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4_1(), "rule__DefinitionsSchemaDefinition__Group_4_1__0");
			builder.put(grammarAccess.getMinItemsSchemaDefinitionAccess().getGroup(), "rule__MinItemsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getOneOfSchemaDefinitionAccess().getGroup(), "rule__OneOfSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getGroup(), "rule__MaxPropertiesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMinimumSchemaDefinitionAccess().getGroup(), "rule__MinimumSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMaxItemsSchemaDefinitionAccess().getGroup(), "rule__MaxItemsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getFormatSchemaDefinitionAccess().getGroup(), "rule__FormatSchemaDefinition__Group__0");
			builder.put(grammarAccess.getReadOnlySchemaDefinitionAccess().getGroup(), "rule__ReadOnlySchemaDefinition__Group__0");
			builder.put(grammarAccess.getTypeSchemaDefinitionAccess().getGroup(), "rule__TypeSchemaDefinition__Group__0");
			builder.put(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getGroup(), "rule__AdditionalPropertiesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getElseSchemaDefinitionAccess().getGroup(), "rule__ElseSchemaDefinition__Group__0");
			builder.put(grammarAccess.getIdSchemaDefinitionAccess().getGroup(), "rule__IdSchemaDefinition__Group__0");
			builder.put(grammarAccess.getConstSchemaDefinitionAccess().getGroup(), "rule__ConstSchemaDefinition__Group__0");
			builder.put(grammarAccess.getDependenciesSchemaDefinitionAccess().getGroup(), "rule__DependenciesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getDependenciesSchemaDefinitionAccess().getGroup_4(), "rule__DependenciesSchemaDefinition__Group_4__0");
			builder.put(grammarAccess.getDependenciesSchemaDefinitionAccess().getGroup_4_1(), "rule__DependenciesSchemaDefinition__Group_4_1__0");
			builder.put(grammarAccess.getRequiredSchemaDefinitionAccess().getGroup(), "rule__RequiredSchemaDefinition__Group__0");
			builder.put(grammarAccess.getDescriptionSchemaDefinitionAccess().getGroup(), "rule__DescriptionSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getGroup(), "rule__MinPropertiesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup(), "rule__PatternPropertiesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4(), "rule__PatternPropertiesSchemaDefinition__Group_4__0");
			builder.put(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4_1(), "rule__PatternPropertiesSchemaDefinition__Group_4_1__0");
			builder.put(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getGroup(), "rule__AdditionalItemsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup(), "rule__ExamplesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4(), "rule__ExamplesSchemaDefinition__Group_4__0");
			builder.put(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4_1(), "rule__ExamplesSchemaDefinition__Group_4_1__0");
			builder.put(grammarAccess.getIfSchemaDefinitionAccess().getGroup(), "rule__IfSchemaDefinition__Group__0");
			builder.put(grammarAccess.getAllOfSchemaDefinitionAccess().getGroup(), "rule__AllOfSchemaDefinition__Group__0");
			builder.put(grammarAccess.getContentEncodingSchemaDefinitionAccess().getGroup(), "rule__ContentEncodingSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMultipleOfSchemaDefinitionAccess().getGroup(), "rule__MultipleOfSchemaDefinition__Group__0");
			builder.put(grammarAccess.getPatternSchemaDefinitionAccess().getGroup(), "rule__PatternSchemaDefinition__Group__0");
			builder.put(grammarAccess.getContainsSchemaDefinitionAccess().getGroup(), "rule__ContainsSchemaDefinition__Group__0");
			builder.put(grammarAccess.getNotSchemaDefinitionAccess().getGroup(), "rule__NotSchemaDefinition__Group__0");
			builder.put(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getGroup(), "rule__ExclusiveMaximumSchemaDefinition__Group__0");
			builder.put(grammarAccess.getMaxLengthSchemaDefinitionAccess().getGroup(), "rule__MaxLengthSchemaDefinition__Group__0");
			builder.put(grammarAccess.getRefSchemaDefinitionAccess().getGroup(), "rule__RefSchemaDefinition__Group__0");
			builder.put(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getGroup(), "rule__ContentMediaTypeSchemaDefinition__Group__0");
			builder.put(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getGroup(), "rule__ExclusiveMinimumSchemaDefinition__Group__0");
			builder.put(grammarAccess.getSchemaSchemaDefinitionAccess().getGroup(), "rule__SchemaSchemaDefinition__Group__0");
			builder.put(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup(), "rule__PropertiesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4(), "rule__PropertiesSchemaDefinition__Group_4__0");
			builder.put(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4_1(), "rule__PropertiesSchemaDefinition__Group_4_1__0");
			builder.put(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getGroup(), "rule__PropertyNamesSchemaDefinition__Group__0");
			builder.put(grammarAccess.getNullValueAccess().getGroup(), "rule__NullValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getSchemaArrayAccess().getGroup(), "rule__SchemaArray__Group__0");
			builder.put(grammarAccess.getSchemaArrayAccess().getGroup_2(), "rule__SchemaArray__Group_2__0");
			builder.put(grammarAccess.getKeySchemaPairAccess().getGroup(), "rule__KeySchemaPair__Group__0");
			builder.put(grammarAccess.getTypesAnyOf2Access().getGroup(), "rule__TypesAnyOf2__Group__0");
			builder.put(grammarAccess.getTypesAnyOf2Access().getGroup_2(), "rule__TypesAnyOf2__Group_2__0");
			builder.put(grammarAccess.getDependenciesAnyOfAccess().getGroup(), "rule__DependenciesAnyOf__Group__0");
			builder.put(grammarAccess.getKeyStringArrayPairAccess().getGroup(), "rule__KeyStringArrayPair__Group__0");
			builder.put(grammarAccess.getStringArrayAccess().getGroup(), "rule__StringArray__Group__0");
			builder.put(grammarAccess.getStringArrayAccess().getGroup_2(), "rule__StringArray__Group_2__0");
			builder.put(grammarAccess.getStringArrayAccess().getGroup_2_1(), "rule__StringArray__Group_2_1__0");
			builder.put(grammarAccess.getJsonSchemaAccess().getSchemaAssignment_1(), "rule__JsonSchema__SchemaAssignment_1");
			builder.put(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_0(), "rule__ObjectSchema__KeywordDefinitionAssignment_2_0");
			builder.put(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_1_1(), "rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1");
			builder.put(grammarAccess.getBooleanSchemaAccess().getValueAssignment(), "rule__BooleanSchema__ValueAssignment");
			builder.put(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumAssignment_2(), "rule__MaximumSchemaDefinition__MaximumAssignment_2");
			builder.put(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyAssignment_2(), "rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2");
			builder.put(grammarAccess.getCommentSchemaDefinitionAccess().getCommentAssignment_2(), "rule__CommentSchemaDefinition__CommentAssignment_2");
			builder.put(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_1(), "rule__EnumSchemaDefinition__ItemsAssignment_1");
			builder.put(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_2_1(), "rule__EnumSchemaDefinition__ItemsAssignment_2_1");
			builder.put(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsAssignment_2(), "rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2");
			builder.put(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfAssignment_2(), "rule__AnyOfSchemaDefinition__AnyOfAssignment_2");
			builder.put(grammarAccess.getTitleSchemaDefinitionAccess().getTitleAssignment_2(), "rule__TitleSchemaDefinition__TitleAssignment_2");
			builder.put(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Assignment_3(), "rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3");
			builder.put(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Assignment_4(), "rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4");
			builder.put(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultAssignment_2(), "rule__DefaultSchemaDefinition__DefaultAssignment_2");
			builder.put(grammarAccess.getThenSchemaDefinitionAccess().getThenAssignment_2(), "rule__ThenSchemaDefinition__ThenAssignment_2");
			builder.put(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthAssignment_2(), "rule__MinLengthSchemaDefinition__MinLengthAssignment_2");
			builder.put(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0(), "rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0");
			builder.put(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1(), "rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1");
			builder.put(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsAssignment_2(), "rule__MinItemsSchemaDefinition__MinItemsAssignment_2");
			builder.put(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfAssignment_2(), "rule__OneOfSchemaDefinition__OneOfAssignment_2");
			builder.put(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesAssignment_2(), "rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2");
			builder.put(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumAssignment_2(), "rule__MinimumSchemaDefinition__MinimumAssignment_2");
			builder.put(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsAssignment_2(), "rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2");
			builder.put(grammarAccess.getFormatSchemaDefinitionAccess().getFormatAssignment_2(), "rule__FormatSchemaDefinition__FormatAssignment_2");
			builder.put(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyAssignment_2(), "rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2");
			builder.put(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1Assignment_3(), "rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3");
			builder.put(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2Assignment_4(), "rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4");
			builder.put(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesAssignment_2(), "rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2");
			builder.put(grammarAccess.getElseSchemaDefinitionAccess().getElseAssignment_2(), "rule__ElseSchemaDefinition__ElseAssignment_2");
			builder.put(grammarAccess.getIdSchemaDefinitionAccess().getIdAssignment_2(), "rule__IdSchemaDefinition__IdAssignment_2");
			builder.put(grammarAccess.getConstSchemaDefinitionAccess().getConstAssignment_2(), "rule__ConstSchemaDefinition__ConstAssignment_2");
			builder.put(grammarAccess.getDependenciesSchemaDefinitionAccess().getDependenciesAssignment_4_0(), "rule__DependenciesSchemaDefinition__DependenciesAssignment_4_0");
			builder.put(grammarAccess.getDependenciesSchemaDefinitionAccess().getDependenciesAssignment_4_1_1(), "rule__DependenciesSchemaDefinition__DependenciesAssignment_4_1_1");
			builder.put(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredAssignment_2(), "rule__RequiredSchemaDefinition__RequiredAssignment_2");
			builder.put(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionAssignment_2(), "rule__DescriptionSchemaDefinition__DescriptionAssignment_2");
			builder.put(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesAssignment_2(), "rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2");
			builder.put(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0(), "rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0");
			builder.put(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1(), "rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1");
			builder.put(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsAssignment_2(), "rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2");
			builder.put(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0(), "rule__KeyValuePair__KeyAssignment_0");
			builder.put(grammarAccess.getKeyValuePairAccess().getValueAssignment_2(), "rule__KeyValuePair__ValueAssignment_2");
			builder.put(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_0(), "rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0");
			builder.put(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_1_1(), "rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1");
			builder.put(grammarAccess.getIfSchemaDefinitionAccess().getIfAssignment_2(), "rule__IfSchemaDefinition__IfAssignment_2");
			builder.put(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfAssignment_2(), "rule__AllOfSchemaDefinition__AllOfAssignment_2");
			builder.put(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingAssignment_2(), "rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2");
			builder.put(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfAssignment_2(), "rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2");
			builder.put(grammarAccess.getPatternSchemaDefinitionAccess().getPatternAssignment_2(), "rule__PatternSchemaDefinition__PatternAssignment_2");
			builder.put(grammarAccess.getContainsSchemaDefinitionAccess().getContainsAssignment_2(), "rule__ContainsSchemaDefinition__ContainsAssignment_2");
			builder.put(grammarAccess.getNotSchemaDefinitionAccess().getNotAssignment_2(), "rule__NotSchemaDefinition__NotAssignment_2");
			builder.put(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumAssignment_2(), "rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2");
			builder.put(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthAssignment_2(), "rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2");
			builder.put(grammarAccess.getRefSchemaDefinitionAccess().getRefAssignment_2(), "rule__RefSchemaDefinition__RefAssignment_2");
			builder.put(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeAssignment_2(), "rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2");
			builder.put(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumAssignment_2(), "rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2");
			builder.put(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaAssignment_2(), "rule__SchemaSchemaDefinition__SchemaAssignment_2");
			builder.put(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0(), "rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0");
			builder.put(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1(), "rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1");
			builder.put(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesAssignment_2(), "rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2");
			builder.put(grammarAccess.getJsonDocumentAccess().getValueAssignment(), "rule__JsonDocument__ValueAssignment");
			builder.put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0(), "rule__ObjectValue__KeyvaluepairAssignment_2_0");
			builder.put(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1(), "rule__ObjectValue__KeyvaluepairAssignment_2_1_1");
			builder.put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
			builder.put(grammarAccess.getArrayValueAccess().getValueAssignment_2_0(), "rule__ArrayValue__ValueAssignment_2_0");
			builder.put(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1(), "rule__ArrayValue__ValueAssignment_2_1_1");
			builder.put(grammarAccess.getSchemaArrayAccess().getItemsAssignment_1(), "rule__SchemaArray__ItemsAssignment_1");
			builder.put(grammarAccess.getSchemaArrayAccess().getItemsAssignment_2_1(), "rule__SchemaArray__ItemsAssignment_2_1");
			builder.put(grammarAccess.getNonNegativeIntegerDefault0Access().getValueAssignment(), "rule__NonNegativeIntegerDefault0__ValueAssignment");
			builder.put(grammarAccess.getKeySchemaPairAccess().getKeyAssignment_0(), "rule__KeySchemaPair__KeyAssignment_0");
			builder.put(grammarAccess.getKeySchemaPairAccess().getValueAssignment_2(), "rule__KeySchemaPair__ValueAssignment_2");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getValueAssignment(), "rule__NonNegativeInteger__ValueAssignment");
			builder.put(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_1(), "rule__TypesAnyOf2__ItemsAssignment_1");
			builder.put(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_2_1(), "rule__TypesAnyOf2__ItemsAssignment_2_1");
			builder.put(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2Assignment_1(), "rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1");
			builder.put(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1Assignment_2(), "rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2");
			builder.put(grammarAccess.getKeyStringArrayPairAccess().getKeyAssignment_0(), "rule__KeyStringArrayPair__KeyAssignment_0");
			builder.put(grammarAccess.getKeyStringArrayPairAccess().getValueAssignment_2(), "rule__KeyStringArrayPair__ValueAssignment_2");
			builder.put(grammarAccess.getStringArrayAccess().getValuesAssignment_2_0(), "rule__StringArray__ValuesAssignment_2_0");
			builder.put(grammarAccess.getStringArrayAccess().getValuesAssignment_2_1_1(), "rule__StringArray__ValuesAssignment_2_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JsonSchemaDslGrammarAccess grammarAccess;

	@Override
	protected InternalJsonSchemaDslParser createParser() {
		InternalJsonSchemaDslParser result = new InternalJsonSchemaDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JsonSchemaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JsonSchemaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
