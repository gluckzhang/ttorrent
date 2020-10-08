#!/bin/bash

mvn test

java -jar ./jacoco-0.8.5/lib/jacococli.jar merge \
./tests/build/jacoco.exec \
./network/build/jacoco.exec \
./common/build/jacoco.exec \
./ttorrent-tracker/build/jacoco.exec \
./bencoding/build/jacoco.exec \
./ttorrent-client/build/jacoco.exec \
--destfile jacoco-merged.exec

java -jar ./jacoco-0.8.5/lib/jacococli.jar report ./jacoco-merged.exec \
--classfiles ./test-api/build/classes \
--classfiles ./cli/build/classes \
--classfiles ./network/build/classes \
--classfiles ./common/build/classes \
--classfiles ./ttorrent-tracker/build/classes \
--classfiles ./bencoding/build/classes \
--classfiles ./ttorrent-client/build/classes \
--sourcefiles ./test-api/src/main/java \
--sourcefiles ./cli/src/main/java \
--sourcefiles ./network/src/main/java \
--sourcefiles ./common/src/main/java \
--sourcefiles ./ttorrent-tracker/src/main/java \
--sourcefiles ./bencoding/src/main/java \
--sourcefiles ./ttorrent-client/src/main/java \
--html ./jacoco-report
