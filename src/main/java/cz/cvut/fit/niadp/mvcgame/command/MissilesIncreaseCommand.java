package cz.cvut.fit.niadp.mvcgame.command;

import cz.cvut.fit.niadp.mvcgame.model.IGameModel;

public class MissilesIncreaseCommand extends AbsGameCommand {
    public MissilesIncreaseCommand(IGameModel model) {
        this.subject = model;
    }

    @Override
    protected void execute() {
        this.subject.increaseMissiles();
    }
}
