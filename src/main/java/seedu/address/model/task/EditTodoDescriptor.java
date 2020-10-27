package seedu.address.model.task;

import seedu.address.commons.util.CollectionUtil;
import seedu.address.model.tag.Tag;

import java.util.Set;

/**
 * Stores the details to edit the todo task with. Each non-empty field value will replace the
 * corresponding field value of the todo task.
 */
public class EditTodoDescriptor extends EditTaskDescriptor {
    private Title title;
    private Description description;
    private Priority priority;
    private Set<Tag> tagList;

    public EditTodoDescriptor() {}

    /**
     * Returns true if at least one field is edited.
     */
    public boolean isAnyFieldEdited() {
        return CollectionUtil.isAnyNonNull(title, description, priority, tagList);
    }

    public Title getTitle() {
        return title;
    }

    public Description getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Set<Tag> getTagList() {
        return tagList;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setTagList(Set<Tag> tagList) {
        this.tagList = tagList;
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof EditTodoDescriptor)) {
            return false;
        }

        // state check
        EditTodoDescriptor e = (EditTodoDescriptor) other;

        return getTitle().equals(e.getTitle())
                && getDescription().equals(e.getDescription())
                && getPriority().equals(e.getPriority())
                && getTagList().equals(e.getTagList());
    }
}
