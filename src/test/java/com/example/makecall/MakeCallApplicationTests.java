package com.example.makecall;

import com.example.makecall.model.Call;
import com.example.makecall.services.CallService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class MakeCallApplicationTests {
	@Autowired
	MockMvc mockMvc;

	@Autowired
	CallService callService;

	@Test
	public void saveCall() throws Exception{
		callService.saveCall(new Call("0538462****", "0256566*****", "anonymous"));
	}

	@Test
	public void getCall() throws Exception{
		callService.getCall("111111");
	}


}
