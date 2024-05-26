package Scripts;

import Scripts.ImagesConversion.ImageCreate;
import Scripts.ImagesConversion.StringToPath;
import Scripts.Panels.CharacterCreation.ClassPanel;
import Scripts.Panels.CharacterCreation.GarmentsPanel;
import Scripts.Screens.CharacterCreation;

public class ShowCharacter {

    public static void setupImages(CharacterCreation panel) {
        // Adicionando UIimage primeiro para garantir que fique no fundo
        ImageCreate UIimage = new ImageCreate(1080, 0, 500, 750);
        UIimage.setIconFile("Images\\hud1.png");
        UIimage.imageSetter();
        panel.add(UIimage);

        // Adicionando charImage em segundo
        ImageCreate charImage = new ImageCreate(1080, 0, 500, 750);
        charImage.setIconFile("Images\\charImage.png");
        charImage.imageSetter();
        panel.add(charImage);

        // Adicionando as outras imagens depois
        String helmChosen = GarmentsPanel.helmetType.toString();
        helmChosen = StringToPath.convertPng(helmChosen);

        ImageCreate helmImage = new ImageCreate(1080, 0, 500, 750);
        helmImage.setIconFile(helmChosen);
        helmImage.imageSetter();
        panel.add(helmImage);

        String classChosen = ClassPanel.getClassChosen();
        classChosen = StringToPath.convertPng(classChosen);

        ImageCreate weaponImage = new ImageCreate(1055, 0, 500, 775);
        weaponImage.setIconFile(classChosen);
        weaponImage.imageSetter();
        panel.add(weaponImage);

        String chestChosen = GarmentsPanel.chestType.toString();
        chestChosen = StringToPath.convertPng(chestChosen);
        ImageCreate torsoImage = new ImageCreate(1080, 0, 500, 750);
        torsoImage.setIconFile(chestChosen);
        torsoImage.imageSetter();
        panel.add(torsoImage);

        String legsChosen = GarmentsPanel.legsType.toString();
        legsChosen = StringToPath.convertPng(legsChosen);

        ImageCreate legsImage = new ImageCreate(1080, 0, 500, 750);
        legsImage.setIconFile(legsChosen);
        legsImage.imageSetter();
        panel.add(legsImage);


        // Ajustar a ordem dos componentes
        panel.setComponentZOrder(UIimage, panel.getComponentCount() - 1);
        panel.setComponentZOrder(charImage, panel.getComponentCount() - 2);
        panel.setComponentZOrder(helmImage, panel.getComponentCount() - 4);
        panel.setComponentZOrder(weaponImage, panel.getComponentCount() - 6);
        panel.setComponentZOrder(torsoImage, panel.getComponentCount() - 3);
        panel.setComponentZOrder(legsImage, panel.getComponentCount() - 5);
    }
}
