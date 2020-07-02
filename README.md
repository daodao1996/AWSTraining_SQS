### AWSTraining SQS & SNS

1. 每 1 mins 自动触发SNS的Topic
2. SNS 自动发送邮件，邮件内容包含所有 event 的内容
3. SNS 向订阅的 SQS中发送消息
4. SQS要有retention(7days) / timeout(5mins)
5. SQS自动触发Lambda运行，Lambda将event的所有内容输出到CloudWatch log中
6. SNS有 logging / encryption 
7. Email Subscription 有 DLQ
8. SQS有 DLQ / encryption
9. tagging
10. As Code: CFN
11. 能够随时部署及删除Project（使用Docker部署）
12. 消息发送失败报警


### 使用
1. docker-compose run build   //build jar包
2. docker-compose run upload  //把jar包上传到S3
3. docker-compose run deploy  //部署aws资源
4. docker-compose run delete  //删除cloudformation stack


