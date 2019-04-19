# bouncy/ros-distro.inc
# General configuration settings that are dependent on ROS_DISTRO.
#
# Copyright (c) 2019 LG Electronics, Inc.

# The release (of Ubuntu) that this ROS distro targets. This determines the versions of the platform packages that OE must
# provide.
ROS_DISTRO_BASELINE_PLATFORM = "bionic"

# Set this here, as each ROS distro will must be tested separately with each OE-Core release.
LAYERSERIES_COMPAT_ros-layer = "thud"

# Override settings from generated-ros-distro.inc here.

# Since superflore doesn't know when it's generating a recipe that it will be for a build tool, it can't know that what's in
# ROS_EXEC_DEPEND are also build tools. Manually add them here.
ROS_SUPERFLORE_GENERATED_BUILDTOOLS += " \
"
