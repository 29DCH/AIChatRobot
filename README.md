# AIChatRobot

AI Chat Robot

基于Android APP、自然语言处理(NLP)解析的常用技术、TensorFlow训练框架、深度学习等实现聊天机器人的应用及部署上线

项目流程:

 1.收集和整理语料，将语料处理成我们需要的形式；
 
 2.搭建神经网络和聊天机器人模型；
 
 3.训练聊天机器人；
 
 4.验证结果并发布成 Restful 接口；
 
 5.搭建 Android 开发环境，并集成科大讯飞WebService接口，实现语音和文字的转换；
 
 6.使用 Android 开发环境进行调用模型并发布 APP；
 
 
NLP技术点:
循环神经网络(RNN)和长短期记忆网络(LSTM)模型,NLP语言模型解析,语料库的获取以及建立方法（Word2vec ，seq2seq）,词与词向量、命名实体识别、词性标注，分类模型（朴素贝叶斯、隐马尔科夫模型等）

词法分析:分词技术、词性标注、命名实体识别(基于规则和词典的方法、基于统计的方法：隐马尔科夫模型HMM、较大熵ME、支持向量机SVM、条件随机场CRF) 、词意消歧

句法分析

语义分析


文本处理方法、Attention机制

聊天机器人的训练思路：


TensorFlow框架:

TensorFlow系统框架原理

使用TensorFlow训练模型的步骤

TensorFlow聊天机器人模型的设计思路

TensorFlow模型构建与训练

TensorFlow模型发布与webservice接口（flask）

 

Android:

Android系统介绍及环境搭建

使用Android调用第三方语音识别接口

Android调用TensorFlow模型

Android界面设计规范

Android应用开发，Android app打包部署
