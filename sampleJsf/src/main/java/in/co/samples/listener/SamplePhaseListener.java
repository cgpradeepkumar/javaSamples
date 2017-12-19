package in.co.samples.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

public class SamplePhaseListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4532090507721546906L;
	
	private static Logger LOGGER =  Logger.getLogger(SamplePhaseListener.class);

	@Override
	public void afterPhase(PhaseEvent event) {
		LOGGER.debug("afterPhase " + event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		LOGGER.debug("beforePhase " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
