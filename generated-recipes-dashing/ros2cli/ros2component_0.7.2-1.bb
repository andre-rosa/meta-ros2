# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The component command for ROS 2 command line tools."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2cli"
ROS_BPN = "ros2component"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    composition-interfaces \
    rcl-interfaces \
    rclcpp-components \
    rclpy \
    ros2cli \
    ros2node \
    ros2param \
    ros2pkg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    ament-xmllint \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2component/0.7.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "544d36ce9fb259bbe0ec67d4189478a2"
SRC_URI[sha256sum] = "c6fd5bf48b7bdcc7ca8aee57af2677dba165140e03eea89688d9e206bd38d88c"
S = "${WORKDIR}/ros2cli-release-release-dashing-ros2component-0.7.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros2cli', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros2cli', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2cli/ros2cli_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2cli/ros2cli-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2cli/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros2cli/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
