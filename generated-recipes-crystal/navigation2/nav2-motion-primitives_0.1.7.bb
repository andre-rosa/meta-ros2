# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Carlos Orduno <carlos.a.orduno@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "navigation2"
ROS_BPN = "nav2_motion_primitives"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    nav2-robot \
    nav2-tasks \
    nav2-util \
    rclcpp \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    nav2-msgs \
    nav2-tasks \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_motion_primitives/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "17c7cedff165f257b202fa767091a514"
SRC_URI[sha256sum] = "50a75ca6f7675e93030ea763839db9e8f4d02795c627dc06f8c0257154c667eb"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_motion_primitives-0.1.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation2', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation2', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/navigation2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation2/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
