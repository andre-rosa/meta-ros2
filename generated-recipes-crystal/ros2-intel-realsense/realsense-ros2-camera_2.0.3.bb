# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The realsense_ros2_camera package"
AUTHOR = "Sharron LIU <sharron.liu@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "realsense_ros2_camera"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    cv-bridge \
    image-transport \
    libeigen \
    librealsense2 \
    rclcpp \
    realsense-camera-msgs \
    rmw-implementation \
    sensor-msgs \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    cv-bridge \
    librealsense2 \
    rclcpp \
    realsense-camera-msgs \
    rmw-implementation \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros2_intel_realsense-release/archive/release/crystal/realsense_ros2_camera/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5764c60a7ee224e6c8d8d8f67c8f86c0"
SRC_URI[sha256sum] = "ccd6585ced405d85548f307ccafaffe130bbcdad898c93a6c447205304b8791d"
S = "${WORKDIR}/ros2_intel_realsense-release-release-crystal-realsense_ros2_camera-2.0.3-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros2-intel-realsense/ros2-intel-realsense_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros2-intel-realsense/ros2-intel-realsense_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2-intel-realsense/ros2-intel-realsense-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2-intel-realsense/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2-intel-realsense/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
