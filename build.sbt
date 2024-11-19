// SchemaGenVersion is defined in project/Version.scala

lazy val root = (project in file("."))
  .settings(
    name := "SpinalHDL Schemetic Generator",
    organization := "com.github.spinalhdl",
    version := SchemaGenVersion.major,
    crossScalaVersions := SchemaGenVersion.compilers,
    scalaVersion := SchemaGenVersion.compilers(0),

    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-library" % scalaVersion.value,

      "com.github.spinalhdl" %% "spinalhdl-core" % SchemaGenVersion.spinal,
      "com.github.spinalhdl" %% "spinalhdl-lib"  % SchemaGenVersion.spinal,
      "com.github.spinalhdl" %% "spinalhdl-tester"  % SchemaGenVersion.spinal,
      compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % SchemaGenVersion.spinal),

      "javax.xml.bind" % "jaxb-api" % "2.3.0",
      "org.scala-lang.modules" %% "scala-xml" % "2.3.0",
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"
    ),

    // Publishing settings
    publishMavenStyle := true,

    publishTo := Some(if (isSnapshot.value) {
      Opts.resolver.sonatypeSnapshots
    } else {
      Opts.resolver.sonatypeStaging
    }),

    credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credentials"),

    pomIncludeRepository := { _ => false },

    licenses := Seq("LGPL3" -> url("https://www.gnu.org/licenses/lgpl.html")),

    homepage := Some(url("https://github.com/Readon/SpinalSchemaGen")),

    scmInfo := Some(
      ScmInfo(
        url("https://github.com/Readon/SpinalSchemaGen"),
        "scm:git@github.com:Readon/SpinalSchemaGen.git"
      )
    ),

    developers := List(
      Developer(
        id = "Readon",
        name = "Yindong Xiao",
        email = "xydarcher@qq.com",
        url = url("https://github.com/Readon")
      ),      
      Developer(
        id = "ZhaokunHu",
        name = "Zhaokun Hu",
        email = "3023211557@qq.com",
        url = url("https://github.com/ZhaokunHu")
      )    
    )
  )

fork := true