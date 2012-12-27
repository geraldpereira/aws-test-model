package fr.byob.game.memeduel.domain;

public class Level {

	private Long id;

	private String owner;

	private String content;

	private String title;

	public Level() {
	}

	public Level(final String owner, final String content) {
		this(null, owner, content, null);
	}

	public Level(final String owner, final String content, final String title) {
		this(null, owner, content, title);
	}

	public Level(final Long id, final String owner, final String content) {
		this(id, owner, content, null);
	}

	public Level(final Long id, final String owner, final String content, final String title) {
		this.id = id;
		this.owner = owner;
		this.content = content;
		this.title = title;
	}

	public Long getId() {
		return this.id;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getContent() {
		return this.content;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setOwner(final String owner) {
		this.owner = owner;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Level other = (Level) obj;
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (owner == null) {
			if (other.owner != null) {
				return false;
			}
		} else if (!owner.equals(other.owner)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Level [id=" + id + ", owner=" + owner + ", content=" + content + ", title=" + title + "]";
	}

}
