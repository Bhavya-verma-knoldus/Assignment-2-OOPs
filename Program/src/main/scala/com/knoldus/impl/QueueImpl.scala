// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus.impl

import com.knoldus.`trait`.Queue

import scala.annotation.tailrec

class DoubleQueue extends Queue {

  override def enqueue(list: List[Int],value: Int): List[Int] = {
    @tailrec def enqueueNested(list: List[Int],outputList: List[Int],value: Int): List[Int] = list match{

      /*Add element to the queue after doubling it when list is empty*/
      case Nil => outputList ::: List(value * 2)

      /*Add element at the end of the queue after doubling it*/
      case head :: Nil =>  outputList ::: List(head) ::: List(value * 2)

      /*Recursively calls enqueueNested method to reach at the end of the queue*/
      case head :: tail => enqueueNested(tail,outputList ::: List(head),value)
    }
    enqueueNested(list,Nil,value)
  }
}

class SquareQueue extends Queue {

  override def enqueue(list: List[Int],value: Int): List[Int] = {
    @tailrec def enqueueNested(list: List[Int],outputList: List[Int],value: Int): List[Int] = list match{

      /*Add element to the queue after squaring it when list is empty*/
      case Nil => outputList ::: List(value * value)

      /*Add element at the end of the queue after squaring it*/
      case head :: Nil =>  outputList ::: List(head) ::: List(value * value)

      /*Recursively calls enqueueNested method to reach at the end of the queue*/
      case head :: tail => enqueueNested(tail,outputList ::: List(head),value)
    }
    enqueueNested(list,Nil,value)
  }
}

object Main extends App{
  val doubleQueue = new DoubleQueue
  val squareQueue = new SquareQueue

  val list = List(1,2,3)

  print(doubleQueue.enqueue(list,5) + "\n")
  print(doubleQueue.dequeue(doubleQueue.enqueue(list,5)) + "\n")

  print(squareQueue.enqueue(list,6) + "\n")
  print(squareQueue.dequeue(squareQueue.enqueue(list,6)) + "\n")
}
