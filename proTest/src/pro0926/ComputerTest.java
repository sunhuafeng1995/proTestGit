package pro0926;


public class ComputerTest {

	/*
	 * 计算器  V_1_2
	 * 实现开始运行程序在控制台打出欢迎页面，
	 * 并且提示用户输入start命令开始计算器、输入end指令结束计算器，（运用计算器过程中 只要用户输入end 就会退出系统）
	 * 当用户输入其他指令的时候，控制台提示“指令有误，请重新输入。”
	 * 开始游戏后提示用户输入第一个要运算的数字（数字可以是double类型）
	 * 当用户输入第一个数字后判断如果不是数字，提示用户请输入数字，
	 * 输入的是可以运算的数字时，提示请输入第二个数字，同样不是数字时提醒用户并重新输入。
	 * 然后提示输入运算法则 + - * /   如果不是运算符号中的一种提醒用户按照指令并重新输入。
	 * 最后显示运算结果。然后提示用户是否继续运算，用户输入yes 后开始新的运算。除了yes以外的就会推出系统。
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.doComputer();
		
	}

}