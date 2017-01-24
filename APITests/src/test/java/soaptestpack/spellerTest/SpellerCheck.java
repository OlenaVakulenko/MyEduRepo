package soaptestpack.spellerTest;

import net.yandex.speller.services.spellservice.CheckTextRequest;
import net.yandex.speller.services.spellservice.CheckTextResponse;
import net.yandex.speller.services.spellservice.SpellService;
import net.yandex.speller.services.spellservice.SpellServiceSoap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by olenka on 23.01.2017.
 */
public class SpellerCheck {

    public CheckTextRequest request;
    public SpellService service;
    public SpellServiceSoap port;


    @Before
    public void setUpStartConditions() {
        request = new CheckTextRequest();
        service = new SpellService();
        port = service.getSpellServiceSoap();
    }


    @Test
    public void checkNumberOfMistakes() {
        request.setLang("EN");
        request.setText("worme weath toda");
        CheckTextResponse checkTextResponse = port.checkText(request);
        Assert.assertTrue("Number of errors does not equal 3", checkTextResponse.getSpellResult().getError().size()==3);
    }

    @Test
    public void checkPosAndRow() {
        request.setLang("EN");
        request.setText("keeen");
        CheckTextResponse checkTextResponse = port.checkText(request);
        Assert.assertTrue("Wrong position",checkTextResponse.getSpellResult().getError().get(0).getPos()==0);
        Assert.assertTrue("Wrong position",checkTextResponse.getSpellResult().getError().get(0).getRow()==0);
    }

    @Test
    public void checkPosAndRowWithLineBreak() {
        request.setLang("EN");
        request.setText("text\r\ntexxt ");
        CheckTextResponse checkTextResponse = port.checkText(request);
        Assert.assertTrue("Wrong position",checkTextResponse.getSpellResult().getError().get(0).getPos()==5);
        Assert.assertTrue("Wrong row",checkTextResponse.getSpellResult().getError().get(0).getRow()==1);
    }

    @Test
    public void checkCorrectionsInPhrase(){
        request.setLang("RU");
        request.setText("Пьеса была сиграна");
        CheckTextResponse checkTextResponse = port.checkText(request);
        Assert.assertTrue("The word 'сиграна' is not in the error list",
                checkTextResponse.getSpellResult().getError().get(0).getWord().contains("сиграна"));
        Assert.assertTrue("Corrections for word 'сиграна' does not contain correction 'сыграна'",
                checkTextResponse.getSpellResult().getError().get(0).getS().contains("сыграна"));
    }

    @Test
    public void checkCorrectionsInWord() {
        request.setLang("RU");
        request.setText("сиграна");
        CheckTextResponse checkTextResponse = port.checkText(request);
        Assert.assertTrue("The word 'сиграна' is not in the error list",
                checkTextResponse.getSpellResult().getError().get(0).getWord().contains("сиграна"));
        Assert.assertTrue("Corrections for word 'сиграна' does not contain correction 'сыграна'",
                checkTextResponse.getSpellResult().getError().get(0).getS().size()==5);
    }

    @Test
    public void autoLangIdentifying() {
        request.setText("пьесса");
        CheckTextResponse checkTextResponse = port.checkText(request);
        Assert.assertTrue(checkTextResponse.getSpellResult().getError().get(0).getS().contains("пьеса"));
    }


}
