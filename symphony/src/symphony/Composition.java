package symphony;

import java.util.ArrayList;

public class Composition {
	private Composer mComposer;
	private String mName;
	private int mId;
	private ArrayList<Soloist> mSoloistList;
	private ArrayList<Movement> mMovementList;

	public Composition() {

	}

	public Composition(Composer comp, String name, int id, ArrayList<Soloist> soloistList,
			ArrayList<Movement> movementList) {
		mComposer = comp;
		mName = name;
		mId = id;
		mSoloistList = soloistList;
		mMovementList = movementList;
	}

	public Composer getComposer() {
		return mComposer;
	}

	public void setComposer(Composer comp) {
		mComposer = comp;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		mId = id;
	}

	public void addSoloist(Soloist soloist) {
		mSoloistList.add(soloist);
	}

	public Soloist getSoloist(int ID) {
		for (Soloist s : mSoloistList) {
			if (s.getId() == ID)
				return s;
		}
		return null;
	}

	public void removeSoloist(int ID) {
		for (int i = 0; i < mSoloistList.size(); i++) {
			if (mSoloistList.get(i).getId() == ID)
				mSoloistList.remove(i);
		}
	}

	public void addMovement(Movement movement) {
		mMovementList.add(movement);
	}

	public Movement getMovement(int ID) {
		for (Movement m : mMovementList) {
			if (m.getmNumber() == ID)
				return m;
		}
		return null;
	}

	public void removeMovement(int ID) {
		for (int i = 0; i < mMovementList.size(); i++) {
			if (mMovementList.get(i).getmNumber() == ID)
				mMovementList.remove(i);
		}
	}

}
