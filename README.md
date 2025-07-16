# template-kafka-broker

This project demonstrates how to use [Apache Kafka](https://kafka.apache.org/) in a Java application. It includes simple Producer and Consumer examples for sending and receiving messages.

## Prerequisites

- Java JDK 8 or higher
- [Apache Kafka](https://kafka.apache.org/downloads) installed locally, or access to a Kafka server
- Maven (recommended) or Gradle for building the project

## Project Structure

```
src/
  main/
    java/
      SimpleProducer.java
      SimpleConsumer.java
pom.xml (if using Maven)
build.gradle (if using Gradle)
```

## Setup

### 1. Clone the Repository

```sh
git clone https://github.com/yourusername/kafka-java-example.git
cd kafka-java-example
```

### 2. Install Dependencies

#### Using Maven

```sh
mvn clean install
```

#### Using Gradle

```sh
./gradlew build
```

### 3. Start Kafka Locally

#### Start Zookeeper

```sh
bin/zookeeper-server-start.sh config/zookeeper.properties
```

#### Start Kafka Broker

```sh
bin/kafka-server-start.sh config/server.properties
```

#### Create a Topic

```sh
bin/kafka-topics.sh --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

## How to Run

### 1. Run the Producer

This will send a message to the Kafka topic:

```sh
mvn exec:java -Dexec.mainClass="SimpleProducer"
```
_or_
```sh
java -cp target/kafka-java-example-1.0-SNAPSHOT.jar SimpleProducer
```

### 2. Run the Consumer

This will read messages from the Kafka topic:

```sh
mvn exec:java -Dexec.mainClass="SimpleConsumer"
```
_or_
```sh
java -cp target/kafka-java-example-1.0-SNAPSHOT.jar SimpleConsumer
```

## Example Output

Producer:
```
Message sent successfully!
```

Consumer:
```
Received message: Hello, Kafka!
```

## Customization

- Change the topic name in the Java files if you want to use a different Kafka topic.
- Update `bootstrap.servers` property if your Kafka server is running elsewhere.

## Further Reading

- [Kafka Documentation](https://kafka.apache.org/documentation/)
- [Kafka Java Client API](https://kafka.apache.org/documentation/#producerapi)

## License

MIT
