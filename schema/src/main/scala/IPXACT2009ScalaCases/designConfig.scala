package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.


case class GeneratorChainConfiguration(generatorChainRef: LibraryRefType,
  configurableElementValues: Option[ConfigurableElementValues] = None)
      
      


case class Abstractor(instanceName: String,
  displayName: Option[String] = None,
  description: Option[String] = None,
  abstractorRef: LibraryRefType,
  configurableElementValues: Option[ConfigurableElementValues] = None,
  viewName: String)
      
      


case class Abstractors(abstractor: Seq[Abstractor] = Nil)
      
      


case class InterconnectionConfiguration(interconnectionRef: String,
  abstractors: Abstractors)
      
      


case class ViewConfiguration(instanceName: String,
  viewName: String)
      
      


case class DesignConfiguration(versionedIdentifierSequence1: VersionedIdentifierSequence,
  designRef: LibraryRefType,
  generatorChainConfiguration: Seq[GeneratorChainConfiguration] = Nil,
  interconnectionConfiguration: Seq[InterconnectionConfiguration] = Nil,
  viewConfiguration: Seq[ViewConfiguration] = Nil,
  description: Option[String] = None,
  vendorExtensions: Option[VendorExtensions] = None) extends IPXACTDocumentTypesOption
      
      

