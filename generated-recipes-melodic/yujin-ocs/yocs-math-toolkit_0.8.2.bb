# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Math toolkit for Yujin open control system. This package is intended to contain common use functions,     mostly for simple mathematics but also for tf-related conversions.     By no means it pretends to be an efficient and robust, widely used math library, but a play ground where     to put common code that is typically repeated in many robot control programs."
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jorge Santos"
HOMEPAGE = "http://ros.org/wiki/yocs_math_toolkit"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_math_toolkit"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-exceptions \
    ecl-formatters \
    ecl-linear-algebra \
    geometry-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-exceptions \
    ecl-formatters \
    ecl-linear-algebra \
    geometry-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-exceptions \
    ecl-formatters \
    ecl-linear-algebra \
    geometry-msgs \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_math_toolkit/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3192d907e5e1c3560a13558cae9e3d41"
SRC_URI[sha256sum] = "53550a80b4e50074b5c5b15fe44f2d4e463ff9f768e6e662b7a7b3d65f2c32fd"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_math_toolkit-0.8.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('yujin-ocs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('yujin-ocs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
