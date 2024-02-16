package umc.beanstalk.common.apiPayload.exception.handler;

import umc.beanstalk.common.apiPayload.code.BaseErrorCode;
import umc.beanstalk.common.apiPayload.exception.GeneralException;

public class ChoiceHandler extends GeneralException {

	public ChoiceHandler(BaseErrorCode code) {
		super(code);
	}
}
