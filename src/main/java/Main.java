import com.google.cloud.auth.samples.AuthExample;

import static com.example.texttospeech.ListAllSupportedVoices.listAllSupportedVoices;

public class Main {
    public static void main (String[] args) throws Exception {
        AuthExample.authExplicit("C:/GitHub/Java/PokerPrompt/Google/service-account.json");
        listAllSupportedVoices();
    }
}
