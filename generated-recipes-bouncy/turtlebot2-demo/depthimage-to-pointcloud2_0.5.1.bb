# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A simple node to convert a depth image and camera info into a PointCloud2."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "turtlebot2_demo"
ROS_BPN = "depthimage_to_pointcloud2"

ROS_BUILD_DEPENDS = " \
    image-geometry \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    image-geometry \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    image-geometry \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/depthimage_to_pointcloud2/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "873d87e41961940026dc2838497d7167"
SRC_URI[sha256sum] = "0e27a91ddf111e56aea0ddf86196fd1f2947ecf62a0615cfe87ebe8396206e2f"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-depthimage_to_pointcloud2-0.5.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('turtlebot2-demo', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('turtlebot2-demo', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot2-demo/turtlebot2-demo_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot2-demo/turtlebot2-demo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot2-demo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot2-demo/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}