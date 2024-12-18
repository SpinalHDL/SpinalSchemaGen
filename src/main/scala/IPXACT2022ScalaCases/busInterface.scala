// Generated by <a href="http://IPXACT2022scalaxb.org/">IPXACT2022scalaxb</a>.
package IPXACT2022ScalaCases

sealed trait EndianessType

object EndianessType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.EndianessType]): EndianessType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: EndianessType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[EndianessType] = Seq(Big, Little)
}

case object Big extends EndianessType { override def toString = "big" }
case object Little extends EndianessType { override def toString = "little" }


case class ViewRef5(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class BusInterfaces(busInterface: Seq[IPXACT2022ScalaCases.BusInterfaceType] = Nil)
      
      


/** Type definition for a busInterface in a component
*/
case class BusInterfaceType(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  busType: IPXACT2022ScalaCases.ConfigurableLibraryRefType,
  abstractionTypes: Option[IPXACT2022ScalaCases.AbstractionTypes] = None,
  interfaceModeOption4: IPXACT2022scalaxb.DataRecord[Any],
  connectionRequired: Option[Boolean] = None,
  bitsInLau: Option[IPXACT2022ScalaCases.UnsignedPositiveLongintExpressionable] = None,
  bitSteering: Option[IPXACT2022ScalaCases.UnsignedBitExpression] = None,
  endianness: Option[IPXACT2022ScalaCases.EndianessType] = None,
  parameters: Option[IPXACT2022ScalaCases.Parameters] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class BusInterfaceRef(localName: String,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Channel(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  busInterfaceRef: Seq[IPXACT2022ScalaCases.BusInterfaceRef] = Nil,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Channels(channel: Seq[IPXACT2022ScalaCases.Channel] = Nil)
      
      


/** A reference to a mode.
*/
case class ModeRef(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class AddressSpaceRef3(vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  baseAddress: Option[IPXACT2022ScalaCases.SignedLongintExpression] = None,
  modeRef: Seq[IPXACT2022ScalaCases.ModeRef] = Nil,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends AddrSpaceRefTypable {
  lazy val addressSpaceRef = attributes("@addressSpaceRef").as[String]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Initiator(addressSpaceRef: Option[IPXACT2022ScalaCases.AddressSpaceRef3] = None)
      
      


case class FileSetRefGroup2(group: Option[String] = None,
  fileSetRef: Seq[IPXACT2022ScalaCases.FileSetRef] = Nil,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class Target(targetoption: Seq[IPXACT2022scalaxb.DataRecord[IPXACT2022ScalaCases.TargetOption]] = Nil,
  fileSetRefGroup: Seq[IPXACT2022ScalaCases.FileSetRefGroup2] = Nil)
      
      

trait TargetOption

case class System(group: String)
      
      


case class RemapAddress(value: String,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends UnsignedLongintExpressionable {
  lazy val minimum = attributes.get("@minimum") map { _.as[Int]}
  lazy val maximum = attributes.get("@maximum") map { _.as[Int]}
}

      
      


case class RemapAddresses(remapAddress: IPXACT2022ScalaCases.RemapAddress,
  modeRef: Seq[IPXACT2022ScalaCases.ModeRef3] = Nil,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class BaseAddresses(remapAddresses: Seq[IPXACT2022ScalaCases.RemapAddresses] = Nil,
  range: IPXACT2022ScalaCases.UnsignedPositiveLongintExpressionable)
      
      


case class MirroredTarget(mirroredtargetsequence1: Option[IPXACT2022ScalaCases.MirroredTargetSequence1] = None)
      
      

case class MirroredTargetSequence1(baseAddresses: Option[IPXACT2022ScalaCases.BaseAddresses] = None)
      

case class MirroredSystem(group: String)
      
      

sealed trait InterfaceMode

object InterfaceMode {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.InterfaceMode]): InterfaceMode = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: InterfaceMode) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[InterfaceMode] = Seq(InitiatorValue2, TargetValue2, SystemValue2, MirroredInitiator, MirroredTargetValue, MirroredSystemValue)
}

case object InitiatorValue2 extends InterfaceMode { override def toString = "initiator" }
case object TargetValue2 extends InterfaceMode { override def toString = "target" }
case object SystemValue2 extends InterfaceMode { override def toString = "system" }
case object MirroredInitiator extends InterfaceMode { override def toString = "mirroredInitiator" }
case object MirroredTargetValue extends InterfaceMode { override def toString = "mirroredTarget" }
case object MirroredSystemValue extends InterfaceMode { override def toString = "mirroredSystem" }


case class Monitor(group: Option[String] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val interfaceMode = attributes("@interfaceMode").as[InterfaceMode]
}

      
      


case class TransparentBridge(vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends TargetOption {
  lazy val initiatorRef = attributes("@initiatorRef").as[String]
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class System2(group: String)
      
      


case class MirroredSystem2(group: String)
      
      


/** Type definition for a busInterface in a component
*/
case class AbstractorBusInterfaceType(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  abstractionTypes: Option[IPXACT2022ScalaCases.AbstractionTypes] = None,
  parameters: Option[IPXACT2022ScalaCases.Parameters] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class IndirectInterfaces(indirectInterface: Seq[IPXACT2022ScalaCases.IndirectInterfaceType] = Nil)
      
      


/** Type definition for a indirectInterface in a component
*/
case class IndirectInterfaceType(nameGroupSequence1: IPXACT2022ScalaCases.NameGroupSequence,
  indirectAddressRef: IPXACT2022ScalaCases.IndirectAddressRef,
  indirectDataRef: IPXACT2022ScalaCases.IndirectDataRef,
  indirectinterfacetypeoption: Seq[IPXACT2022scalaxb.DataRecord[Any]] = Nil,
  bitsInLau: Option[IPXACT2022ScalaCases.UnsignedPositiveLongintExpressionable] = None,
  endianness: Option[IPXACT2022ScalaCases.EndianessType] = None,
  parameters: Option[IPXACT2022ScalaCases.Parameters] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      

trait IndirectInterfaceTypeOption

case class IndirectAddressRef(fieldReferenceGroupSequence1: IPXACT2022ScalaCases.FieldReferenceGroupSequence)
      
      


case class IndirectDataRef(fieldReferenceGroupSequence1: IPXACT2022ScalaCases.FieldReferenceGroupSequence)
      
      


case class LogicalPort(name: String,
  range: Option[IPXACT2022ScalaCases.RangeType] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class SubPort(name: String,
  partSelect: Option[IPXACT2022ScalaCases.PartSelect] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class PhysicalPort(name: String,
  partSelect: Option[IPXACT2022ScalaCases.PartSelect] = None,
  subPort: Seq[IPXACT2022ScalaCases.SubPort] = Nil,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) extends PortMapOption {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class PortMap(logicalPort: IPXACT2022ScalaCases.LogicalPort,
  portmapoption: IPXACT2022scalaxb.DataRecord[IPXACT2022ScalaCases.PortMapOption],
  isInformative: Option[Boolean] = None,
  vendorExtensions: Option[IPXACT2022ScalaCases.VendorExtensions] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
  lazy val invert = attributes("@invert").as[String]
}

      
      

trait PortMapOption

case class PortMaps(portMap: Seq[IPXACT2022ScalaCases.PortMap] = Nil)
      
      


case class AbstractionType(viewRef: Seq[IPXACT2022ScalaCases.ViewRef5] = Nil,
  abstractionRef: IPXACT2022ScalaCases.ConfigurableLibraryRefType,
  portMaps: Option[IPXACT2022ScalaCases.PortMaps] = None,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


case class AbstractionTypes(abstractionType: Seq[IPXACT2022ScalaCases.AbstractionType] = Nil)
      
      

trait AbstractorInterfaceModeOption
trait InterfaceModeOption
