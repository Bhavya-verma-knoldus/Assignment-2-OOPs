# Queue Operations

## What is Queue?
A Queue is a linear structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO). A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first.

## Description
I have created a queue trait and 2 classes which are mixed with queue trait to perform queue operations.

## Trait used in this assignment

### Queue trait
Queue trait has 2 methods, enqueue and dequeue where enqueue is the abstract method and dequeue is the concrete method.

## Classes used in this assignment

### DoubleQueue class
It enqueues the element after doubling them.

### SquareQueue class
It enqueues the element after squaring them

## Commands

### Compile code

```bash
sbt compile
```
### Execute main class
Firstly, go to the root directory of the module where src and target folder is present and then run the below command:-

```bash
sbt run
```

### Delete all generated files

```bash
sbt clean
```

### Generate scalastyle config file

```bash
sbt scalastyleGenerateConfig
```

### Execute scalastyle plugin

```bash
sbt scalastyle
```