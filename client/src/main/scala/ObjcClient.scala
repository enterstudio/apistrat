/**
 *  Copyright 2012 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import com.wordnik.swagger.codegen.BasicObjcGenerator

object ObjcClient extends BasicObjcGenerator {
  def main(args: Array[String]) = generateClient(args)

  // where to write generated code
  val outputFolder = "objc-client"

  // where to write generated code
  override def destinationDir = outputFolder + java.io.File.separator + "Classes"

  additionalParams ++= Map("projectName" -> "SampleProject")

  // supporting classes
  override def supportingFiles =
    List(
      ("SWGObject.h", destinationDir, "SWGObject.h"),
      ("SWGObject.m", destinationDir, "SWGObject.m"),
      ("SWGApiClient.h", destinationDir, "SWGApiClient.h"),
      ("SWGApiClient.m", destinationDir, "SWGApiClient.m"),
      ("SWGFile.h", destinationDir, "SWGFile.h"),
      ("SWGFile.m", destinationDir, "SWGFile.m"),
      ("SWGDate.h", destinationDir, "SWGDate.h"),
      ("SWGDate.m", destinationDir, "SWGDate.m"),
      ("Podfile.mustache", outputFolder, "Podfile")
    )
}