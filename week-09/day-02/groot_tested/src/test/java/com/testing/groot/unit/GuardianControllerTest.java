package com.testing.groot.unit;

import com.testing.groot.controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void GuardianController_HttpResponseIsOKwithGivenParam() throws Exception {
        mockMvc.perform(get("/groot/?message=test")).andExpect(status().isOk());
    }

    @Test
    public void GuardianController_GivenParamIsAsExpected() throws Exception {

        String content = "{ \n" +
                "  \"received\": \"test\",\n" +
                "  \"translated\": \"I am groot\"\n" +
                "}";

        mockMvc.perform(get("/groot/?message=test").contentType(MediaType.APPLICATION_JSON).content(content))
                .andDo(print()).andExpect(status().isOk());

    }
}
