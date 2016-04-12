package com.importsource.yarn.rpc.service;

/****
**This package is mainly about service .eg.  getCpu, getMemory and so on.
*
*现在我们需要把一个应用程序启动起来
*
*客户端向我请求说要执行一个统计单词数量的应用程序。我接到这个请求后。  会看看我的下属们谁做这个比较擅长，并且现在有时间。我就安排给他让他来做。
*
*分步骤：
*
*1、那么我要有清单。员工清单。每个员工的属性要有。
*
*2、客户端和我通信是通过什么？是rpc吗？
*
*3、找到擅长的人。然后告诉他们（通过rpc）说请做哪些任务。把任务的链接告诉他们
*
*
*
*我把一个jar包上传到hdfs。然后告诉指定的机器说，快去下载并启动这些jar。
*
*
**/