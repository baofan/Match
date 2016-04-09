package com.mh.view;

public interface OnToolsChangeListener {
	
	public static final int TOOL_SUCCESS = 0;
	public static final int TOOL_FAIL = 1;
	public static final int TOOL_USED_UP = 2;
	
	/**
	 * ����ˮ��˳��ʱ���õķ���
	 * @param leftNum ʣ�����
	 * @param state ״̬
	 */
	public void onDisruptChange(int leftNum, int state);
	/**
	 * ������ʾʱ�ص��ķ���
	 * @param leftNum
	 * @param state 0��ʾ�ɹ����ң�1��ʾ����ʧ�ܣ�2��ʾ����������
	 */
	public void onTipChange(int leftNum, int state);
}
