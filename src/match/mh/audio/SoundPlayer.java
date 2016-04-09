package match.mh.audio;

import java.util.HashMap;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundPlayer {

	// ��Ч������
	int streamVolume;

	// ����SoundPool ����
	private SoundPool soundPool;

	// ����HASH��
	private HashMap<Integer, Integer> soundPoolMap;

	/**
	 * ��ʼ������ϵͳ
	 * @param context ������
	 */
	@SuppressLint("UseSparseArrays")
	public void initSounds(Context context) {
		// ��ʼ��soundPool ����,��һ�������������ж��ٸ�������ͬʱ����,��2����������������,������������������Ʒ��
		soundPool = new SoundPool(25, AudioManager.STREAM_MUSIC, 100);

		// ��ʼ��HASH��
		soundPoolMap = new HashMap<Integer, Integer>();

		// ��������豸���豸����
		AudioManager mgr = (AudioManager) context
				.getSystemService(Context.AUDIO_SERVICE);
		streamVolume = mgr.getStreamVolume(AudioManager.STREAM_MUSIC);
	}

	/**
	 * ����Դ�е���Ч���ص�ָ����ID(���ŵ�ʱ��Ͷ�Ӧ�����ID���ž�����)
	 * @param context ������
	 * @param raw ��ԴID
	 * @param ID ָ����ID
	 */
	public void loadSfx(Context context, int raw, int ID) {
		soundPoolMap.put(ID, soundPool.load(context, raw, 1));
	}
	/**
	 * ��������Ƭ��
	 * @param sound Ҫ���ŵ���Ч��ID
	 * @param uLoop ѭ���Ĵ���
	 */
	public void play(int sound, int uLoop) {
		soundPool.play(soundPoolMap.get(sound), streamVolume, streamVolume, 1,
				uLoop, 1f);
	}
}