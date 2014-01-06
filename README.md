Simple logstash examples with Java
===


Starting the shipper module:

java -jar logstash-1.3.2-flatjar.jar agent -f shipper.conf


Starting the indexer:

java -jar logstash-1.3.2-flatjar.jar agent -f indexer.conf


Starting kibana:

java -jar logstash-1.3.2-flatjar.jar web

