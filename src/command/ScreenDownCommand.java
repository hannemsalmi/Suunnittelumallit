package command;

public class ScreenDownCommand implements Command {
	private ProjectionScreen screen;

	public ScreenDownCommand(ProjectionScreen screen) {
	this.screen = screen;
	}

	@Override
	public void execute() {
		screen.screenDown();
	}
}
