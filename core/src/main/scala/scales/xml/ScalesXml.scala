package scales.xml

trait ScalesXmlImplicits extends XmlTypesImplicits 
  with XmlPathImplicits 
  with DslImplicits 
  with QNameImplicits 
  with XmlParserImplicits
  with DefaultXmlVersion
  with XmlPrinterImplicits 
  with TraxConversionImplicits 
  with XmlUtilsImplicits
  with OptimisingStrategiesImplicits
  with serializers.SerializerImplicits {
}

object ScalesXml extends ScalesXmlImplicits