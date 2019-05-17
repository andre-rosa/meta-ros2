# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Commands for performing common operations when   developing on the robots. For help, run `fetch -h` and `fetch   COMMAND -h`."
AUTHOR = "Russell Toris <rtoris@fetchrobotics.com>"
ROS_AUTHOR = "Alex Henning"
HOMEPAGE = "https://github.com/fetchrobotics/fetch_tools/blob/master/README.md"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_tools"
ROS_BPN = "fetch_tools"

ROS_BUILD_DEPENDS = " \
    python-rospkg \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-argcomplete \
    python-catkin-lint \
    roslint \
    sshpass \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_tools-release/archive/release/melodic/fetch_tools/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "33ab2540b83c1e3e6cfeca7416471cf3"
SRC_URI[sha256sum] = "1dc7b3cc138e2c8bd7aefabfe41c5330f581f101b7d668e4873fc5657be92c73"
S = "${WORKDIR}/fetch_tools-release-release-melodic-fetch_tools-0.2.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fetch-tools', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fetch-tools', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-tools/fetch-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-tools/fetch-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-tools/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
