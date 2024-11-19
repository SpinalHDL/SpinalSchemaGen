import com.typesafe.config._
import java.io.File
import scala.collection.JavaConverters._

object SchemaGenVersion {
  val configFilePath = os.Path(sourcecode.File()) / os.up / "version.conf"
  val conf = ConfigFactory.parseFile(new File(configFilePath.toString)).resolve()

  val compilers = conf.getStringList("compilers").asScala.toList
  val compilerIsRC = conf.getBoolean("compilerIsRC")
  
  val spinal = conf.getBoolean("spinal")

  val isDev = conf.getBoolean("isDev")
  val isSnapshot = conf.getBoolean("isSnapshot")
  private def snapshot = if (isSnapshot) "-SNAPSHOT" else ""
  private val major = conf.getString("major")
  val all         = if(isDev) "dev" else s"$major$snapshot"
  val schema      = all
}
