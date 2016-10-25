# Flink with Scala and SBT skeleton

This is a template for setting up Flink-based projects.

## Adding code
Simple use the `src/{main, test}/{java, scala, scala-2.11}/packageName/fileName.scala` scheme.

The `.gitignore` that is provided will take care of properly adding files.

## Dependencies and testing
It uses SBT for dependency management and I chose ScalaTest for unit testing.

## Running or testing
Simply use `sbt run` or `sbt test` from a terminal.
