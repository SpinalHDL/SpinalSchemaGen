import sbt._
import com.typesafe.config._
import sourcecode.File
import sbt.io.Path
import scala.collection.JavaConverters._

object SchemaGenVersion {  
  val currentFile = new java.io.File(sourcecode.File())
  val configFilePath = currentFile.getParent + Path.sep + "version.conf"
  val conf = ConfigFactory.parseFile(new java.io.File(configFilePath)).resolve()

  val compilers = conf.getStringList("compilers").asScala.toList
  val compilerIsRC = conf.getBoolean("compilerIsRC")
  
  val spinal = conf.getString("spinal")

  val isDev = conf.getBoolean("isDev")
  val isSnapshot = conf.getBoolean("isSnapshot")
  private def snapshot = if (isSnapshot) "-SNAPSHOT" else ""
  val major = conf.getString("major")
  val all         = if(isDev) "dev" else s"$major$snapshot"
  val schema      = all
   
  def scalaXmlVersion(scalaVersion: String): String = {
    CrossVersion.partialVersion(scalaVersion) match {
      case Some((2, n)) if n >= 12 => "2.1.0" 
      case Some((2, 11)) => "1.3.1"
      case _ => throw new RuntimeException(s"Unsupported Scala version: $scalaVersion")
    }
  }
   
  def scalaParserCombinatorVersion(scalaVersion: String): String = {
    CrossVersion.partialVersion(scalaVersion) match {
      case Some((2, n)) if n >= 12 => "2.1.1" 
      case Some((2, 11)) => "1.1.2"
      case _ => throw new RuntimeException(s"Unsupported Scala version: $scalaVersion")
    }
  }
}
