package Scripts.ShowCharacter;

import Scripts.ImagesConversion.ImageCreate;
import Scripts.ImagesConversion.StringToPath;
import Scripts.Panels.CharacterCreation.ClassPanel;
import Scripts.Panels.CharacterCreation.GarmentsPanel;
import Scripts.Screens.CharacterCreation;

public class ShowCharacter {

    public static void setupImages(CharacterCreation panel) {

        ImageCreate UIimage = new ImageCreate(1080, 0, 500, 750);
        UIimage.setIconFile("Images\\hud1.png");
        UIimage.imageSetter();
        panel.add(UIimage);

        ImageCreate charImage = new ImageCreate(1080, 0, 500, 750);
        charImage.setIconFile("Images\\charImage.png");
        charImage.imageSetter();
        panel.add(charImage);

        String helmChosen = GarmentsPanel.helmetType.toString();
        helmChosen = StringToPath.convertPng(helmChosen);

        ImageCreate helmImage = new ImageCreate(1080, 0, 500, 750);
        helmImage.setIconFile(helmChosen);
        helmImage.imageSetter();
        panel.add(helmImage);

        String classChosen = ClassPanel.getClassChosen();
        classChosen = StringToPath.convertPng(classChosen);

        ImageCreate swordImage = new ImageCreate(1055, 0, 500, 775);
        swordImage.setIconFile(classChosen);
        swordImage.imageSetter();
        panel.add(swordImage);

        ImageCreate torsoImage = new ImageCreate(1080, 0, 500, 750);
        torsoImage.setIconFile("Images\\torsoImage.png");
        torsoImage.imageSetter();
        panel.add(torsoImage);
    }


}
