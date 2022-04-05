# api-spock-starter

A repo that is a starter for a Rest Assure based API tests in Spock framework.

* [Requirements](#requirements)
* [Test run](#test-run)
* [Test report](#test-report)

## Requirements

* Java JDK 11 or Java JDK 8

## Test run

1. Download/clone this project
2. Run below command in main project folder

Linux / MacOS

```shell
./gradlew clean build test
```

Windows

```shell
./gradlew clean build test
```

Or run tests directly in IDE.

## Test report

Test report will be generated after each test run:

```shell
../out/spock-reports/index.html
```