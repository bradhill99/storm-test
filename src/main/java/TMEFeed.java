import java.util.Map;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;

public class TMEFeed extends BaseRichSpout {
	private SpoutOutputCollector outputCollector;
	
	@Override
	public void nextTuple() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open(Map arg0, TopologyContext arg1, SpoutOutputCollector outputCollector) {
		// TODO Auto-generated method stub
		this.outputCollector = outputCollector; 
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {
		// TODO Auto-generated method stub
		
	}

}
