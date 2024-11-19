package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.


case class ConfigurableElementValues(configurableElementValue: Seq[ConfigurableElementValue] = Nil)
      
      


case class ConfigurableElementValue(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val referenceId = attributes("@referenceId").as[String]
}

      
      


case class ComponentInstance(instanceName: String,
  displayName: Option[String] = None,
  description: Option[String] = None,
  componentRef: LibraryRefType,
  configurableElementValues: Option[ConfigurableElementValues] = None,
  vendorExtensions: Option[VendorExtensions] = None)
      
      


case class ComponentInstances(componentInstance: Seq[ComponentInstance] = Nil)
      
      


case class InternalPortReference(attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val componentRef = attributes("@componentRef").as[String]
  lazy val portRef = attributes("@portRef").as[String]
  lazy val left = attributes.get("@left") map { _.as[BigInt]}
  lazy val right = attributes.get("@right") map { _.as[BigInt]}
}

      
      


case class ExternalPortReference(attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val portRef = attributes("@portRef").as[String]
  lazy val left = attributes.get("@left") map { _.as[BigInt]}
  lazy val right = attributes.get("@right") map { _.as[BigInt]}
}

      
      


case class AdHocConnection(nameGroupPortSequence1: NameGroupPortSequence,
  internalPortReference: Seq[InternalPortReference] = Nil,
  externalPortReference: Seq[ExternalPortReference] = Nil,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val tiedValue = attributes.get("@tiedValue") map { _.as[String]}
}

      
      


case class AdHocConnections(adHocConnection: Seq[AdHocConnection] = Nil)
      
      


case class Interconnection(nameGroupSequence1: NameGroupSequence,
  activeInterface: Seq[Interfacable] = Nil)
      
      


case class Interconnections(interconnection: Seq[Interconnection] = Nil,
  monitorInterconnection: Seq[MonitorInterconnection] = Nil)
      
      


/** A representation of a component/bus interface relation; i.e. a bus interface belonging to a certain component.
*/
trait Interfacable {
  def componentRef: String
  def busRef: String
}


/** A representation of a component/bus interface relation; i.e. a bus interface belonging to a certain component.
*/
case class InterfaceType(attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends Interfacable {
  lazy val componentRef = attributes("@componentRef").as[String]
  lazy val busRef = attributes("@busRef").as[String]
}

      
      


case class MonitorInterconnection(nameGroupSequence1: NameGroupSequence,
  monitoredActiveInterface: HierInterface,
  monitorInterface: Seq[HierInterface] = Nil)
      
      


/** Hierarchical reference to an interface
*/
case class HierInterface(attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends Interfacable {
  lazy val componentRef = attributes("@componentRef").as[String]
  lazy val busRef = attributes("@busRef").as[String]
  lazy val path = attributes.get("@path") map { _.as[String]}
}

      
      

