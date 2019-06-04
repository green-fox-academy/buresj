package com.testing.groot.unit;

import com.testing.groot.controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void GuardianControllerForGroot_HttpResponseIsOKwithGivenParam() throws Exception {
        mockMvc.perform(get("/askGroot/?message=test"))
                .andExpect(status()
                        .isOk());
    }

    @Test
    public void GuardianControllerForGroot_GivenParamIsAsExpected() throws Exception {

        String content = "{ \n" +
                "  \"received\": \"test\",\n" +
                "  \"translated\": \"I am askGroot\"\n" +
                "}";

        mockMvc.perform(get("/askGroot/?message=test")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                    .andDo(print())
                    .andExpect(status().isOk());
    }

    @Test
    public void GuardianControllerForGroot_HttpResponseWithoutParam() throws Exception {
        mockMvc.perform(get("/askGroot/"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void GuardianControllerForGroot_ErrorResponseReturned() throws Exception {

        String content = "{ \n" +
                "  \"error\": \"I am askGroot\"\n" +
                "}";

        mockMvc.perform(get("/askGroot/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    public void GuardianControllerForArrow_HttpResponseIsOKwithGivenParam() throws Exception {
        mockMvc.perform(get("/yondu/?distance=0&time=0"))
                .andExpect(status()
                        .isOk());
    }

    @Test
    public void GuardianControllerForYondu_GivenParamIsAsExpected() throws Exception {

        String content = "{ \n" +
                "  \"distance\": \"10.0\",\n" +
                "  \"time\": \"10.0\"\n" +
                "  \"speed\": \"100.0\"\n" +
                "}";

        mockMvc.perform(get("/yondu/?distance=0&time=0")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
