/*
 * Copyright (C) 2009-2017 Lightbend Inc. <https://www.lightbend.com>
 */
//#actor
//###replace: package actors;
package javaguide.akka;

import akka.actor.*;
//###replace: import actors.HelloActorProtocol.*;
import javaguide.akka.HelloActorProtocol.*;

public class HelloActor extends UntypedAbstractActor {

    public static Props getProps() {
        return Props.create(HelloActor.class);
    }

    public void onReceive(Object msg) throws Exception {
        if (msg instanceof SayHello) {
            sender().tell("Hello, " + ((SayHello) msg).name, self());
        }
    }
}
//#actor
