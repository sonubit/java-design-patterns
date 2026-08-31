package creational.factory;

public final class NotificationFactory {

    private NotificationFactory() {
    }

    public static Notification create(String type) {

        if (type == null) {
            throw new IllegalArgumentException(
                    "Notification type is required"
            );
        }

        return switch (type.toLowerCase()) {

            case "email" -> new EmailNotification();

            case "sms" -> new SmsNotification();

            default -> throw new IllegalArgumentException(
                    "Unsupported notification type: " + type
            );
        };
    }
}
