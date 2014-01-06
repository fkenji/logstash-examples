import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


def logger = LoggerFactory.getLogger(String.class)

logger.info("Tesssting!!")

try {
    throw new RuntimeException()
}  catch(Exception e) {
    logger.error("Some bad thing happened:",e);
}


logger.info("SomeJob, id:{}", 142382347);
logger.info("SomeOtherJob, id={}", 4246324277);

println "done."