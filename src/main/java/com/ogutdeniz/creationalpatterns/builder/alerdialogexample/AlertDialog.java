package com.ogutdeniz.creationalpatterns.builder.alerdialogexample;

class AlertDialog {
    private String m_title;
    private String m_text;
    private ButtonType m_buttonType;
    private IconType m_iconType;

    //...

    private AlertDialog(String title, String text, ButtonType buttonType, IconType iconType)
    {
        m_title = title;
        m_text = text;
        m_buttonType = buttonType;
        m_iconType = iconType;
    }

    public static class Builder {
        private final AlertDialog m_dialog;

        public Builder()
        {
            m_dialog = new AlertDialog("", "", ButtonType.OK, IconType.NONE);
        }

        public Builder setTitle(String title)
        {
            //...
            m_dialog.m_title = title;

            return this;
        }

        public Builder setText(String text)
        {
            //...

            m_dialog.m_text = text;

            return this;
        }

        public Builder setButton(ButtonType buttonType)
        {
            //...

            m_dialog.m_buttonType = buttonType;

            return this;
        }

        public Builder setIcon(IconType iconType)
        {
            //...

            m_dialog.m_iconType = iconType;

            return this;
        }

        public AlertDialog build()
        {
            return m_dialog;
        }
    }

    public void show()
    {
        if (!m_title.isEmpty())
            System.out.println(String.format("Title:%s", m_title));

        if (!m_text.isEmpty())
            System.out.println(String.format("Text:%s", m_text));

        if (m_buttonType != ButtonType.NONE)
            System.out.println(String.format("Buttons:%s", m_buttonType));

        if (m_iconType != IconType.NONE)
            System.out.println(String.format("Icon:%s", m_iconType));
    }
}
