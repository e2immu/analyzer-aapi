cd e2immu-aapi-archive/src/main/resources/org/e2immu/analyzer/aapi/archive/analyzedPackageFiles/jdk/openjdk-21.0.7
jar cf ../openjdk-24.0.1.jar *.json
cd ../openjdk-23.0.2/
jar cf ../openjdk-21.0.7.jar *.json
cd ../openjdk-23.0.2/
jar cf ../openjdk-23.0.2.jar *.json
cd ../../libs/
jar cf ../libs.jar */*.json

