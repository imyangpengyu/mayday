package javaPart.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

/**
 * @author ypy
 * @date 2018/1/15 17:10
 * 一个任务的抽象类，所有的任务都是他的子类
 */
public abstract class Duty implements Callable<String> {

}
