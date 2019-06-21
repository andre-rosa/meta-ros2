# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "AprilTag detection node"
AUTHOR = " <Rauch.Christian@gmx.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "apriltag_msgs"
ROS_BPN = "apriltag_ros"

ROS_BUILD_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    libeigen \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/christianrauch/apriltag_ros-release/archive/release/dashing/apriltag_ros/2.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a6d98e55a124df14a6c6c6f5ea949c9b"
SRC_URI[sha256sum] = "bfabf35ecf84556c651f337be8d7ce7e5add67b3a9e1bf5b929a71904ead3cd5"
S = "${WORKDIR}/apriltag_ros-release-release-dashing-apriltag_ros-2.0.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('apriltag-msgs', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('apriltag-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag-msgs/apriltag-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag-msgs/apriltag-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}