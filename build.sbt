name := "Assignment - 2 (OOPs)"

version := "0.1"

scalaVersion := "2.12.12"

lazy val program = project.in(file("Program"))

lazy val root = project.in(file(".")).aggregate(program)