package command;

public class ScreenUpCommand implements Command {
	private ProjectionScreen screen;

	public ScreenUpCommand(ProjectionScreen screen) {
	this.screen = screen;
	}

	@Override
	public void execute() {
		screen.screenUp();
	}
}
