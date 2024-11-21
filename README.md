# SpinalHDL library for schematic generation

## Usage
1. Add below line to build.sbt
``` Scala
libraryDependencies += "io.github.readon" %% "spinalhdl-schema-gen" % "0.0.4"
```
2. Use HDElkDiagramGen to generate diagram with HDElk in html.
``` Scala
HDElkDiagramGen(SpinalVerilog(MyTopLevel()))
```
3. Use IPXACTGenerator for IPXACT files generation.
   - Call generateDesignView to generate files for Kactus2 to support architecture display.
   - Call generateIPXACTVivadoComponent for Vivado IP packager.
``` Scala
val designRTL = SpinalConfig(
  mode = Verilog,
  oneFilePerComponent = true
).generate(new MyTopLevel)
val designGenerator = new IPXACTGenerator(designRTL)
designGenerator.generateDesignView()
designGenerator.generateIPXACTVivadoComponent()
```
